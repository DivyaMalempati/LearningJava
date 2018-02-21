public class IsUniqueCharacterInString {
	public static void main(String[] args) {
		System.out.println(isCharecterUnique("Nagarjuna"));
	}
	
	public static boolean isCharecterUnique(String inputString) {
		for(int currentIndex=0;currentIndex<inputString.length();currentIndex++) {
			char currentCharacter = inputString.charAt(currentIndex);
			for(int comparingIndex=0;comparingIndex<currentIndex;comparingIndex++) {
				if(inputString.charAt(comparingIndex)==currentCharacter) {
					return false;
				}
			}
		}
		return true;
	}
}