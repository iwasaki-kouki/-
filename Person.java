public class Person {
  //性別を決める
  String seibetu;
  Person(String seibetu){
    this.seibetu=seibetu;
  }
  //返事を決める
  public void speak(){
    switch(seibetu){
      case "男性":
      System.out.println("I'm a Man");
      break;
      case "女性":
      System.out.println("I'm a Woman");
      break;

    }

  }


}