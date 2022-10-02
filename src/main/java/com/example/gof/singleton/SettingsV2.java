package com.example.gof.singleton;

public class SettingsV2 {

  /**
   * synchronized 방법
   * 멀티쓰레드에 안전하게 synchronized
   * 간단하지만 락을 걸기에 성능상에 이슈가 발생할 수 있다.
   */
  private SettingsV2() {}

  private static SettingsV2 instance;

  public static  synchronized SettingsV2 getInstance() {
    if (instance == null) {
      instance = new SettingsV2();
    }
    return instance;
  }

}
