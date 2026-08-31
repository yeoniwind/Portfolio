package com.example.buddydoubling;  // 패키지 선언 추가

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RoutineAdapter adapter;
    private List<RoutineItem> routineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewRoutine);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        routineList = new ArrayList<>();
        adapter = new RoutineAdapter(routineList);
        recyclerView.setAdapter(adapter);

        // 기본 루틴을 추가합니다.
        addDefaultRoutines();
    }

    private void addDefaultRoutines() {
        routineList.add(new RoutineItem("이부자리 정리", "0.3km"));
        routineList.add(new RoutineItem("세수하기", "0.1km"));
        routineList.add(new RoutineItem("아침밥 먹기", "0.4km"));
        routineList.add(new RoutineItem("양치하기", "0.2km"));
        adapter.notifyDataSetChanged();
    }
}
