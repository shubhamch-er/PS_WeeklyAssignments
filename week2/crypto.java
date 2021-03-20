class Crypto {
  
  public static String wordPattern(final String word){
    // Your code here!
    
    int code[] = new int[26];
    int length=0;
    for(int i=0;i<26;i++){
      code[i]=-1;
    }
    
    StringBuffer ans = new StringBuffer("");
    for(int i=0;i<word.length();i++){
      char ch=word.charAt(i);
      int index = Character.toLowerCase(ch)-'a';
      if(code[index]==-1){
        code[index]=length++;
      }
      ans.append(code[index]+".");
    }
    
    return ans.substring(0,ans.length()-1);
  }
}
