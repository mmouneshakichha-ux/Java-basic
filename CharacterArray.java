public class CharacterArray 
{
    public static void pro1(char ch[])
{
    int vowelscount = 0;
    int constantcount = 0;
    for(int i = 0; i < ch.length; i++)
    {
        if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
    {
        if(ch[i] == 'a' || ch[i] == 'A'|| ch[i] == 'e' || ch[i] == 'E'|| ch[i] == 'i' || ch[i] =='I' || ch[i] == 'o' || ch[i] == 'O'|| ch[i] == 'u' || ch[i] == 'U')
        {
            vowelscount++;

        }
        else
        {
            constantcount++;

            }

        }

        }
        System.out.println("Vowels = "+ vowelscount);
        System.out.println("constantcount =" + constantcount);

    }

    public static void main(String[] args) 
    {
        char[] ch = {'a','p','p','l','e'};
        pro1(ch);
        
    }


    }
    

