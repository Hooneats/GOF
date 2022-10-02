package com.example.gof.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

  /**
   * 싱글톤을 깨는 방법
   * @param args
   */
  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
    // TODO 리플랙터 이용 (다른객체만들어준다.)
//    SettingsV5 settings1 = SettingsV5.getInstance();
//    Constructor<SettingsV5> constructor = SettingsV5.class.getDeclaredConstructor();
//    constructor.setAccessible(true);
//    SettingsV5 settings2 = constructor.newInstance();
//    System.out.println(settings1 == settings2);


    // TODO 직렬화 역직렬화 이용 (다른객체만들어준다.) --> 역직렬화는 readResolve() 로 해결이된다.
    SettingsV5 instance1 = SettingsV5.getInstance();
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(instance1);
    }
    SettingsV5 instance2 = null;
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      instance2 = (SettingsV5) in.readObject();
    }
    System.out.println(instance1 == instance2);

  }

}
