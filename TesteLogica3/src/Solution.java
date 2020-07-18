
public class Solution 
{
	public int solution(int N, int M)
	{
		int resposta = 0;
		boolean continuar = true;
		
		int array[] = new int[N];		//aux
		
		for(int i = 0; i < N; i++)
		{
			array[i] = i;
		}
		
		//se for -1 é pq virou papel
		
		
		int i = 0;
		do
		{
			if(i >= 9)
				i = 0;
			
			if(array[i] == -1)
				continuar = false;
			
			int posicaoAtual = (i * M)%10;
			
			array[posicaoAtual] = -1;
			
			i++;
			resposta++;
		}while(continuar);
		
		return resposta;
	}
	
}
