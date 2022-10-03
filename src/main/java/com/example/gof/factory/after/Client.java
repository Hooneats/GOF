package com.example.gof.factory.after;

/**
 * 확장에는 열려있고 변경에 닫혀있는 OCP 원칙을 지킬 수 있다.
 * 그 이유는 Creator 와 Factory 의 느슨한 관계로 만들었기 때문이다.
 * 기존 코드를 건드리지 않고 다양한 객체를 만들 수 있다.
 * 단점은 Factory 로 생산해 내는 다양한 객체들이 만들어지다보니 클래스가 늘어난다.
 *
 * 자바 8에 들어가 인터페이스에는 default 메서드를 구현할 수 있고
 * 자바 9에 들어가 인터페이스에 private 메서드를 구현할 수 있다.
 */
public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship", "k@naver.com");
        System.out.println("whiteship = " + whiteship);
        Ship blackship = new BlackShipFactory().orderShip("blackship", "k@naver.com");
        System.out.println("blackship = " + blackship);

        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "k@naver.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip("whiteship", "k@naver.com"));
    }

}
