package ex1;

public class CompareExam1 {

	public static void main(String[] args) {
		int bo1 = 10;
		int bo2 = 5;
		
		boolean bototal = (bo1 >= bo2); 
		System.out.println(bototal);
		//boolean�� ��,���� ���а��� 
		
		boolean hi1 = !true;
		System.out.println(!hi1 + "�Դϴ�.");
		
		System.out.println("====================");
		
		
		char chr1 = 'A' ; //65 �����ڵ�
		char chr2 = 'B' ; //66  
		
		
		boolean bototal1 = (chr1 > chr2) ;  // chr1=A=65 �� �������� false 
		System.out.println(bototal1);
		//���� -> �����ڵ� ���ڷ� ��ȯ�Ͽ� ������ ���� 
		
		char chr3 = '1' ;
		char chr4 = 1 ; 
		
		
		boolean bototal2 = (chr3 == chr4) ;  //���ڿ� �����ڵ� �ٸ� 
		System.out.println(bototal2);
	
		int sum1 = 1 ;
		double sum2 = 1.0;
		
		System.out.println(sum1 == sum2); 
		// -> sum1�� 4����Ʈ �̰� sum2�� 8����Ʈ�� sum1�� ū ����(8����Ʈ)�� �ν� �Ͽ� 1->1.0���κ���
		System.out.println("====================");
		double dob1 = 0.4;
		float flo1 = 0.4f;
		System.out.println(dob1 == flo1); //double�� float�� ����ġ 
		
		System.out.println((float)dob1 == flo1); //���� ���� float�� ���� �ϸ� ��ġ
		System.out.println(dob1 == (double)flo1); 
		System.out.println(dob1); //���� 
		System.out.println("====================");
		System.out.println(dob1);
		System.out.println((float)dob1);
		System.out.println(flo1);
		System.out.println((double)flo1);
	}

}
