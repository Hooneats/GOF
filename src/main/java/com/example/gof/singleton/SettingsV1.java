package com.example.gof.singleton;

public class SettingsV1 {

  /**
   * 가장 단순한 싱글톤
   * 싱글톤은 new 로 만들게 하면 안된다.
   */
  private SettingsV1() {}

  private static SettingsV1 instance;

  public static SettingsV1 getInstance() {
    if (instance == null) {
      instance = new SettingsV1();
    }
    return instance;
  }

}
