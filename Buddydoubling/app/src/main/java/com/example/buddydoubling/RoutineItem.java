package com.example.applemango_4;  // 패키지 선언 추가

public class RoutineItem {
    private String routineName;
    private String distance;

    public RoutineItem(String routineName, String distance) {
        this.routineName = routineName;
        this.distance = distance;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
