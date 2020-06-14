package week1Day1;

public class RemoveDuplicates {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input = "We learn java basics as part of java sessions in java week1";
//		String[] words = input.split("\\s");
//
//		
//		
//		int count =0;
//		for(int i=0;i<words.length;i++) {
////			String util
//			for(int j=0;j<words.length;j++)
//			{
////				boolean dflag = false;
////				if(i!=j) {
//				if(words[i].equalsIgnoreCase(words[j]))
//				{
//					count = count +1;
////					dflag = true;
//					
//				}
//				}
////				if(dflag) {
////					words[j] = "";
////				}
////			}
//			if (count>1)
//			{
//				words[i] = "";
//			}
//			count = 0;
//		}
//		System.out.println("text after removing duplicates :");
//		for (String word : words) {
//			System.out.print(" "+word);
//		}
//
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "We learn java basics as part of java sessions in java week1";
		String[] words = input.split("\\s");
		for(int i=0;i<words.length;i++) {
			if(!words[i].equals("")) {
				for(int j=0;j<words.length;j++)
				{
					if(i!=j) {
						if(words[i].equalsIgnoreCase(words[j])) {
							words[i] = "";
						}
					}
				}
			}
		}
		System.out.println("text after removing duplicates :");
		for (String word : words) {
			System.out.print(" "+word);
		}

	}
}
