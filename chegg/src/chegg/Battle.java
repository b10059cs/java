package chegg;

public class Battle {

	public static void main(String[] args) {
		
		int a[]={5,-5,4,3,-1,-6,-1,0,-5};
		int max=0;
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<=0){
				sum+=a[i];
			}else{
				if(sum<=max){
					max=sum;
				}
				sum=0;
			}
			
		}
		System.out.println(max);

	}

}
