package com.ranzan.unit31sprint_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class HomeFragment extends Fragment implements ItemClickListener {
    private RecyclerView recyclerView;
    private ViewPager2 viewPager2;
    private ItemClickListener listener;
    private List<NowShowingItem> list;
    private NavController navController;
    private RecyclerAdapter recyclerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        fetchPost();
    }

    private void fetchPost() {
        ApiService apiService = Network.getRetrofitInstance().create(ApiService.class);
        apiService.getData().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.body() != null)
                    list = response.body().getNowShowing();
                setRecyclerView();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(getContext(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void setRecyclerView() {
        if (list == null) {
            list = new ArrayList<>();
        }
        recyclerAdapter = new RecyclerAdapter(list, listener);
        recyclerView.setAdapter(recyclerAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    @Override
    public void ItemClicked(Response response, int position) {
        Bundle bundle=new Bundle();
        bundle.putSerializable("data", (Serializable) response.getNowShowing().get(position));
        navController.navigate(R.id.action_homeFragment_to_movieDetailsFragment,bundle);
    }
}