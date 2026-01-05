class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        long x=0;
        int neg=0,c=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='-' && c>0)
           break;
           else if(s.charAt(i)=='+' && c>0)
             break;
            else if(s.charAt(i)=='-')
            {
                c++;
                neg=1;
            }
            
             else if(s.charAt(i)=='+')
             {
                c++;
                 continue; 
             }
                     
            else if(!(s.charAt(i)>=48 && s.charAt(i)<=57))
            break;
            else
            {
                int digit=s.charAt(i)-'0';
                if(x>214748364 || (x==214748364 && digit>(neg==1?8:7)))
                    return neg==1?-2147483648:2147483647;
                c++;
                x=x*10+digit;
            }
            

        }
        if(neg==1)
        return (int)-x;
        else
        return (int)x;
    }
}
