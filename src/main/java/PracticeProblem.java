public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int getAge(String[] names, int[] ages, String name){
		int index = -1, i = 0;
		while (index < 0 && i < names.length){
			if (names[i].equals(name)){
				index = i;
			}
			i++;
		}
		return ages[index];
	}

	public static int[] createLengthArray(String[] strArray){
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < intArray.length; i++){
			intArray[i] = strArray[i].length();
		}
		return intArray;
	}

	public static void swapPeople(String[] names, int[] ages, String name1, String name2){
		int index1 = -1, index2 = -1, i = 0;
		while ((index1 < 0 || index2 < 0) && i < names.length){
			if (names[i].equals(name1)){
				index1 = i;
			}
			if (names[i].equals(name2)){
				index2 = i;
			}
			i++;
		}
		int age1 = ages[index1], age2 = ages[index2];
		names[index1] = name2;
		names[index2] = name1;
		ages[index1] = age2;
		ages[index2] = age1;
	}
}
