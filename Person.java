public class Person {
  //性別を決める
  String seibetu;
  Person(String seibetu){
    this.seibetu=seibetu;
  }
  //返事を決める
  public void speak(){
      System.out.println("I'm a "+seibetu);
  }
}