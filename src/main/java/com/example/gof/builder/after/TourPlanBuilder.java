package com.example.gof.builder.after;

import com.example.gof.builder.before.TourPlan;
import java.time.LocalDate;

public interface TourPlanBuilder {

  TourPlanBuilder title(String title);

  TourPlanBuilder nightsAndDays(int nights, int days);

  TourPlanBuilder startDate(LocalDate localDate);

  TourPlanBuilder whereToStay(String whereToStay);

  TourPlanBuilder addPlan(int day, String plan);

  TourPlan getPlan();
}
