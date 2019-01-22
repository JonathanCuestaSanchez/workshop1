# workshop1
***Git Basic Concepts and Maven Basic Concepts***
======

*Laboratorio 1 ARSW*

  Integrantes:
  -------
  * Alejandro Rodriguez del Toro
  * Jonathan Cuesta Sanchez
  

  Profesor:
  -------
  ##### SAAVEDRA ORJUELA DAVID ARMANDO

*** Reporte Git Basic Concepts ***

*_Creating a local repository:_*
------- 
creamos un folder un una ubicacion a conveniencia, usamos el comnados de consola para dirigirnos a el, intriduciomos elcomando "git init" 

![alt text][1]

[1]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/lab101.png

*_Let's  code:_*
-------
Programamos nuestrasolucion para el problema en java.

![alt text][2]

[2]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/lab102.png

*_Preserving our changes:_*
-------
Usamos el comando "git add . "
Answer: What is the purpose of this command? Respuesta// el proposito del comando "git add ." es el de agradir todos los paths del repositorio ya sean nuevos o modificaciones de estos mismos. 
Usamos el comando "git commit -m "Message" "
Answer : Why we used it? Respuesta// Lo usamos porque es un comando que nos permite guardar los cambios en el repositorio agragandole un mensaje de confirmacion

Usamos el comando "git push origen master"
Answer: What is the purpose of the this command? Respuesta// lo usamos para que se suban los ocumentos al repositoriogiten la ubicaion master del mismo 
 
usamos el coamndo "git clone"
Answer: What is the purpose of this command?// respuesta el propositoes eldepordertenerlacopia delrepositrioque yaesta en git en una maquinateneiendo el link del repositorio.

![alt text][5]

[5]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/lab106.png

*_commit report:_*
 
![alt text][6]

[6]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/lab108.png

*_Using pull command_*

Usamos el comando git pull origin master en otra computadora
Answer: What that command does? // respuestaparapoder tener la actualizacion de loscambios relizadosen el masterdelrepositorio

*_Create maven proyect:_*
-------

Primero colocamos el comando  mvn archetype:generate -B -DgroupId=edu.eci -DartifactId=file-spy, lo cual genera el proyecto mvn.
El comando –B, también puede escribirse como --batch-mode, lo que se busca es configurar el modo por lotes que usara automáticamente los valores predeterminados en lugar de pedirlos, además permite que los logs sean más legibles. El –D o –define <arg> se encarga de definir una propiedad del sistema. 

Groupid identifica de manera única el proyecto, se recomienda aplicar esquema de nombres al ponerlo en un proyecto, el artifacid es el nombre del jar, no tiene en cuenta la versión se crea un proyecto maven con nombre file-spy, cuenta con una carpeta src y el pom, dentro de la carpeta están main y test, en cada una creamos resources sin nada adrento, en el main está el app.java .

![alt text][21]

[21]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/img1.png



SNAPSHOT en la versión, se refiere a una versión instantánea la cual es utilizada como una versión que puede ser modificada, algo alejada de la real, maven busca dependencias de manera local, si no lo encuentra, buscara repositorios remotos, si maven encuentra un snapshot.jar, lo interpretara como una versión sujeta a cambios o incompleta, por lo que buscara la versión más actualizada en los repositorios remotos.

El pom es un contenedor de submodulos, cada uno representado en un subdirectorio en el pom.xml, cuando maven construye el proyecto, lo hará dentro de targets con cada submodulo.

El tag de dependencies se usa para configurar los complementos para la compilación del proyecto, y dependency es el tag de las dependencias usadas en el proyecto.

*_Dependency Management_*
-------

![alt text][22]

[22]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn2.png


La función de la clase es detectar cambios en una carpeta, informa de este si son text o cvs.



![alt text][23]

[23]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn3.png


*_Building Lifecycles and Plugins_*
-------
El default se usa para manejar la implementación del proyecto, el clean es el encargado de limpiar el proyecto y el site se encarga de la creación de la documentación del sitio del proyecto.

El mvn compile se encarga de compilar el código fuente del proyecto.
La dependencia transitiva, es aquella que depende de sus dependencias directas, es decir si A depende de B, y B depende de C, C es una dependencia transitiva de A. 


![alt text][24]

[24]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn4.png



![alt text][25]

[25]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn5.png



El mvn package toma el código compilado y lo comprime en el formato de distribuciónJAR.


![alt text][26]

[26]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn6.png



![alt text][27]

[27]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn7.png


El mvn install busca el paquete del repositorio local y lo instala, de esta manera se puede usar como dependencia para otros proyectos	


![alt text][28]

[28]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn8.png


![alt text][29]

[29]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn 9.png


creamos el otro proyecto

![alt text][30]

[30]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn10.png


por ultimo provamos su funcionamiento


![alt text][31]

[31]:https://github.com/JonathanCuestaSanchez/workshop1/blob/master/Laboratorio1/src/images/mvn11.png

