# Taller 5 - AREP
En este taller, se desarrolló una aplicación basada en el microframework de Spark, enfocada en servicios GET para calcular funciones trigonométricas como seno y coseno, 
identificar palíndromos y determinar la magnitud de vectores en dos dimensiones. Además, el cliente puede llamar asincrónamente estas funciones por medio de formularios 
independientes. También, se creó un contenedor Docker configurado en la máquina local y se subió la imagen a un repositorio en DockerHub para facilitar el despliegue y 
la distribución de la aplicación.

## Empezando
Las siguientes instrucciones permiten que obtenga una copia del proyecto en funcionamiento.

### Prerrequisitos
1. Maven y JDK para compilar y ejecutar el proyecto.
2. Docker para poder descargar la imagen y ejecutarla.
3. Verificar disponibilidad del puerto para que el servidor web lo pueda usar sin inconvenientes.
4. Tener conexión a internet.

### Instalación
1. Por terminal
   
   Para obtener el proyecto y ejecutarlo, debe ser descargado en formato zip o puede ser clonado desde el repositorio de GitHub. Con el proyecto en su máquina,
   debe acceder al directorio que contiene el proyecto. Cambie el puerto de acceso con `set PORT=34000`. Luego, debe descargar
   las dependencias del proyecto, para esto ejecute el comando `mvn clean install`. Después, para compilar ejecute el comando `mvn package` y por último ejecute el comando
   `java -cp "target/classes;target/dependency/*" co.edu.escuelaing.sparkdockerdemolive.SparkWebServer`.

   **Nota**
   Si tiene Mac o Linux cambie el ; por :
   
3. Con Docker
   
   Para descargar la imagen ejecuta el comando `docker pull jessicadmunozo/firstsparkwebapprepo:latest`, ahora ejecuta el contenedor con el comando 
   `docker run -d -p 34000:46000 --name dockersparkprimer jessicadmunozo/firstsparkwebapprepo:latest` y para verificar que el contenedor está en ejecución se usa el comando
   `docker ps`.

## Despliegue
Con el proyecto corriendo debe abrir en un navegador la siguiente dirección: http://localhost:34000/hello allí podrá observar el servicio GET básico para la ruta *hello*.

## Diseño
Se tiene un servidor *SparkWebServer* implementado en Java que brinda servicios GET para operaciones como seno, coseno, identificación de palíndromos y para
calcular la magnitud de un vector. Además permite configurar sobre qué puerto va a escuchar dicho servidor por medio de variables de entorno. Ahora bien, se tienen unos
archivos estáticos que se usan para brindar un formulario diferente a cada función, y puede recibir los datos necesarios para realizar la operación deseada, con el fin de
tener un llamado asíncrono de las mismas. 

Por su parte, para la creación de las imagenes se creó un archivo *Dockerfile* el cual permite crear una nueva imagen de un contenedor. Para crear una imagen se usa el 
comando `docker build`, para revisar las imagenes que se tiene se usa el comando `docker images`. También se crearon varias instancias de una misma imagen en
diferentes puertos físicos y se verificó la ejecución de estas. 

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/7b805612-5b4a-4ffd-94e1-225df7844459)

Y se subió dicha imagen a un repositorio en *DockerHub*

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/fa22fb11-7efd-40bf-a61a-b0912c38a718)

## Evaluación
Con la dirección http://localhost:34000/response.html se pueden observar los 4 formularios para cada función.

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/f857856d-13b9-426a-817c-391a09e1f0db)

Si se ingresa un número para calcular el seno y se da clic en el botón *Submit* se observa:

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/4ce422b4-a0eb-4dc8-81bb-e28d67e4a402)

Al igual con el coseno

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/8e7aa63c-d257-4ddc-8663-0b6c22c0ccd4)

Una palabra palíndroma 

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/f012b26b-6156-4e65-9a34-5295014a78c1)

Una palabra que no es palíndroma

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/ad1318f7-e79c-4c3b-a6f2-eb97901216f2)

Y el cálculo de la magnitud de un vector

![image](https://github.com/JessicaDMunozO/Taller5-AREP/assets/123814482/fbea74da-84c1-48fa-b031-d2f693bfed37)

## Construido con
Maven - Gestión de dependencias
Docker - Creación y ejecución de contenedores

## Versiones
Git - Control de versiones

## Autor
Jessica Daniela Muñoz Ossa




