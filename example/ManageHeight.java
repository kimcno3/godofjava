package example;
public class ManageHeight{
    // �ν��Ͻ� ���� ���� : ���� 5��, �л����� ����
    int[][] gradeHeights = new int[5][];
    
    // main �Լ�
    public static void main(String[] args){
        ManageHeight sample = new ManageHeight();
        // 2�� �޼ҵ� ���� : �ݺ� �л����� Ű ������ ����
        sample.setData();
        
        // Loop�� ���� �ݹ�ȣ ���� ����
        int classNo=1;
        // 3~4�� �޼ҵ� ��(for��) : �ݺ� �л����� Ű ���
        for (classNo=1; classNo<=sample.gradeHeights.length; classNo++){
            sample.printHeight(classNo);
        }
        // �ݹ�ȣ �ʱ�ȭ
        classNo = 1;
        // 5~6�� �޼ҵ� ����(while��) : �ݺ� �л����� Ű ��� ���
        while (classNo<=5){
            sample.printAverage(classNo);
            classNo++;
        }
    }
    // 2�� �޼ҵ� : �ݺ� �л��� Ű�� ����
    public void setData(){
        gradeHeights[0] = new int[] {170,180,173,175,177};
        gradeHeights[1] = new int[] {160,165,167,186};
        gradeHeights[2] = new int[] {158,177,187,176};
        gradeHeights[3] = new int[] {173,182,181};
        gradeHeights[4] = new int[] {170,180,165,177,172};

        /*
        int [][] allHeights =  {{170,180,173,175,177},
                                {160,165,167,186},
                                {158,177,187,176},
                                {173,182,181},
                                {170,180,165,177,172}};

        for (int i=0; i<allHeights.length; i++){
            // 1���� �迭 ����(�ν��Ͻ� ������ i��° �迭�� allHeights�� i���� �迭�� ���̸�ŭ ����)
            gradeHeights[i] = new int[allHeights[i].length];
            for (int j=0; j<allHeights[i].length; j++){
                // �� ����(�� ������ i��° �迭�� j���� ��ġ�� ���� �Ҵ�)
                gradeHeights[i][j] = allHeights[i][j];
            }
        }
        */
    }
    // 3~4�� �޼ҵ�  : �ݺ� �л����� Ű�� ���
    public void printHeight(int classNo){
        // �ش� �ݿ� �ش��ϴ� �ε����� ���
        int classIdx = classNo-1;
        System.out.println("Class No." + classNo);
        // ����� �ε����� �ش��ϴ� �迭�� loop�ϸ鼭 ������ ���
        for(int StudentHeight : gradeHeights[classIdx]){
            System.out.println(StudentHeight);
        }
        System.out.println();
    }
    // 5~6�� �޼ҵ� : �ݺ� �л����� Ű��հ� ���
    public void printAverage(int classNo){
        // �ʿ��� ���� ����(�迭�� �ε���, �հ�, ���)
        int classIdx = classNo-1;
        double sum = 0.0;
        double average = 0.0;

        System.out.println("Class No." + classNo);
        // ����� �ε����� �ش��ϴ� �迭�� Loop�ϸ鼭 �հ� ���
        for(int studentHeight : gradeHeights[classIdx]){
          sum += studentHeight;
        }
        // �հ�� �迭�� ���̸� ���� ��� ���
        average = (double)(sum/gradeHeights[classIdx].length);
        // ��հ� ���
        System.out.println("Height Average : " + average);
    }
}
