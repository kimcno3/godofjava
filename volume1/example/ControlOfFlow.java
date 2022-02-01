package volume1.example;

public class ControlOfFlow{
    public static void main(String args[]){
        ControlOfFlow control = new ControlOfFlow();
        control.switchCalendar(1);
        control.switchCalendar(5);
        control.switchCalendar(7);
        control.switchCalendar(4);
        control.switchCalendar(6);
        control.switchCalendar(11);
        control.switchCalendar(2);
        control.switchCalendar(13);
    }
    public void switchCalendar(int month){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "���� 31�ϱ���");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "���� 30�ϱ���");
                break;
            case 2:
                System.out.println(month + "���� 28�ϱ���(������ 29�ϱ���)");
                break;
            default:
                System.out.println(month + "���� �������� �ʽ��ϴ�.");
                break;
        }
    }
}
