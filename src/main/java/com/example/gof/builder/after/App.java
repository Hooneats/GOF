package com.example.gof.builder.after;

import com.example.gof.builder.before.TourPlan;
import java.time.LocalDate;

/**
 * 복잡한 생성절차 또는 값들이 많은 객체를 명시적으로 순차적으로 객체를 만들 수 있다.
 * director 를 사용해서 복잡한 객체를 만드는 과정을 숨길 수 있다.(클라이언트 코드는 깔끔해진다.)
 * 불안전한 객체를 만드는것을 방지할 수 있다.
 *
 * 빌더라는 객체를 또 만들어야 하므로 이는 단점이 될 수 있다.
 */
public class App {

  public static void main(String[] args) {
    TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
    TourPlan tourPlan = tourDirector.cancunTrip();
    TourPlan longBeachTrip = tourDirector.longBeachTrip();
  }
}
