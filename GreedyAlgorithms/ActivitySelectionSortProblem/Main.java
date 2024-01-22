package GreedyAlgorithms.ActivitySelectionSortProblem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));

        ActivitySelection activitySelection = new ActivitySelection();
        activitySelection.activitySelection(activityList);
    }
}
