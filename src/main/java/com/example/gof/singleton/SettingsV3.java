package com.example.gof.singleton;

public class SettingsV3 {

  /**
   * eager initialization 방법
   * 만약 인스턴스 생성에 많은 비용이 들어가지 않는다면
   * 멀티쓰레드에 안전하게 미리 만들어놔도 된다.
   * ---> 만들어놨는데 쓰지 않는다면 자원의 낭비가 될 수 있다.(lazy loading 불가)
   */
  private SettingsV3() {}

  private static final SettingsV3 INSTANCE = new SettingsV3();

  public static  SettingsV3 getInstance() {
    return INSTANCE;
  }

}
