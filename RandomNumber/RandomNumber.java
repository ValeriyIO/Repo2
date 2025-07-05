package RandomNumber;

import java.util.Scanner;
import java.io.InputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class RandomNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str;

		String fName="javaLog.txt";
		File f = new File(fName);
		try
		{
			//Если файл не существует
			if(!f.exists())
			{
				f.createNewFile();
				System.out.println("Файл создан" + f.getName());
			}
		}catch(IOException e)
		{
			System.out.println("Произошла ошибка");
			e.printStackTrace();
		}
		do
		{
			str = sc.nextLine();
			System.out.println("String: \"" + str + "\"");
		}
		while(!str.equals("0"));
	}
}