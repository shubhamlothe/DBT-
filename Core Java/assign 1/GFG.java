class GFG
{
	static void removeChar(String s,char c)
{
	int j, count=0, n=s.lenght();
	char[]t = s.toCharArray();
	for(int i= j= 0; i<n; i++){
	if(t[i] !=c)
	t[j++] = t[i];
	else
	count++;
	}
	while(count > 0)
	{
	t[j++] = '\0';
	count--;
	}
System.out.println(t);
}

public static void main (String[] args)
{ 
    String s = "geeksforgeeks"; 
    removeChar(s, 'g'); 
} 
}
