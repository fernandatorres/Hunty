# Hunty
# QA-NEW
# Instalación Selerium para Automatización de pruebas
Instalación de JDK 
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/a1a36aeb-79f2-4f75-b5ab-07be16a4fd51)
<br />
## Configuración en Variables de ambiente
<br />
Creamos nueva variable de usuario para la configuración de JAVA
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/cea6dd62-55ab-4995-bc62-7b41ee64b4b3)
<br />
De igual forma en Variable del sistema
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/0fb053d9-88f5-4d36-ba52-cd019bf08685)
<br <br /><br />
En la opción del PACH adicionamos uno con la ruta de acceso de donde está ubicada.
<br />
<br /><br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/65b6e728-807d-486c-ae6e-85d8f68bae6b)
<br />
Para verificar la correcta instalación en CMD se verifica.
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/d0bab8ac-12c1-45df-89cb-3024b93005b4)


<br />
Continuamos descargando Maven apache, una vez la computadora solo descomprimimos y continuamos en la configuración de variables de ambiente. 
<br />
Se crea una nueva variable del sistema con ubicación del archivo.
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/46362599-c15a-42f4-af6d-74559d75409e)

<br />En la opción de PACH agregamos la siguiente línea 
<br />
%MAVEN_HOME%\bin
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/664306ee-4b37-4b06-96ff-48d938ceabed)
<br />
Verificamos en CMD con el código mvn -v
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/9d56e1ac-789d-4a0a-9442-794137ac7221)
<br />
Instalación de la interfaz gráfica intellij
<br />![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/163066fa-613e-45df-8292-73e51a162ed9)
<br />

<br />
Se descarga los drivers de Google chome
<br />Verificamos la versión actual deL navegador, en este caso la versión seria la 114 
<br />

En mi caso guardare en el escritorio para ser usada una vez iniciemos a ser automatización de pruebas. 

<br />
Importamos Dependencia de selerium para a ejecutar pruebas en la clase pom.xlm agregamos las siguientes líneas de código 

<br />
 ![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/3da0d4e2-c1ce-4a1b-b08e-22e63547e41)

<br />



<br />

La dependencia mencionada anterior mente se debe  agragar el codigo en Pom.xml
<br />
### Importar Herramienta de Testing 
<br />
En la clase pon.xml agregamos las líneas de código 
<br />
![image](https://github.com/fernandatorres/QA-NEW/assets/11081538/8324d540-a0de-4a01-a10d-b6d1c8a445ac)
