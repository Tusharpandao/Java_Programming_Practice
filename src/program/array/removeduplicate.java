package program.array;

public class removeduplicate  {   
   
    
    public static void main(String[] args)   
    {   
        String st = "hello happy this abcd";  
    
        char str[]=new char[st.length()];
        for (int i = 0; i < str.length; i++) {
            str[i]=st.charAt(i);
        }
         int index = 0;  
        for (int i = 0; i < str.length; i++)   
        {      
            int j;
            for ( j = 0; j < i; j++)    
            {   
                if (Character.isAlphabetic(str[i])) {
                 if (str[i] == str[j])   
                {   
                    break;   
                } 
                }
                 
            }    
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }
        String string=""; 
        for (int i = 0; i < index; i++) {
            string += str[i];
            
        }
        System.out.println(string);
        // for (int i = 0; i < index; i++) {
        //     System.out.print(str[i]);
        // } 
        
    }   
}  

