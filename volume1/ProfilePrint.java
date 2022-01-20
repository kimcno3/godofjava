package example;
public class ProfilePrint{
  public static void main(String args[]){
    ProfilePrint profile = new ProfilePrint();
    
    profile.setAge((byte)27);
    profile.setName((String)"�輱ȣ");
    profile.setMarried((boolean)false);
    
    System.out.println("����: " + profile.getAge());    
    System.out.println("�̸�: " + profile.getName());
    System.out.println("��ȥ����: " + profile.getMarried());

  }
  byte age;
  String name; // String name = new String("�輱ȣ");
  boolean isMarried;
  
  public void setAge(byte age2){
    age = age2;
  }
  public void setName(String name2){
    name = name2;
  }
  public void setMarried(boolean flag){
    isMarried = flag;
  }
  
  public byte getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
  public boolean getMarried(){
    return isMarried;
  }
}