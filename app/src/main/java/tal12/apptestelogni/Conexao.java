package tal12.apptestelogni;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Josué on 28/09/2016.
 */
public class Conexao {

    public static String postDados(String urlUsuario, String parametroUsuario){
        URL url;
        HttpURLConnection connection = null;

        try{
            url = new URL(urlUsuario);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");

            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-lenght", " " + Integer.toString(parametroUsuario.getBytes().length));

            connection.setRequestProperty("Content-Language","pt-BR" );

            connection.setUseCaches(false);

            connection.setDoInput(true);

            connection.setDoOutput(true);

            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());

            dataOutputStream.writeBytes(parametroUsuario);
            dataOutputStream.flush();
            dataOutputStream.close();


            InputStream inputStream = connection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String linha;
            StringBuffer resposta = new StringBuffer();

            while((linha = bufferedReader.readLine()) != null){
                resposta.append(linha);
                resposta.append("\r");
            }
            bufferedReader.close();

            return resposta.toString();
        }
        catch(Exception erro){

            return null;
        } finally {
            {
               if(connection != null){
                   connection.disconnect();
               }
            }
        }


    }
}
