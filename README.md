## PASOS REALIZADOS PARA EL EXAMEN COD 


### FORK DEL REPOSITORIO :
  
Se realiza un fork del repositorio original de damian al personal

<BR>

### CLONAR EL REPOSITORIO :
 
Se clona el repositorio en mi máquina local para trabajar desde el intellij

<BR>

### CREAMOS LA NUEVA RAMA `readme` :

```bash
git checkout -b readme
``` 

<BR>

## EL SIGUIENTE PASO CONTIENE LOS TAGS ( LA VERSION Y MERGE ) 

### FUSIONAMOS LAS RAMAS : 
- La rama readme es la unica que no vamos a fusionar siguiendo el enunciado así que realizaremos lo que se nos pide :
```bash
git checkout main # PARA CAMBIAR A LA RAMA MAIN DESDE DONDE TENEMOS QUE REALIAZAR LOS MERGE
git merge datos # REALIZAMOS EL MERGE DE LA RAMA DATOS A LA MAIN

# AQUÍ VAMOS A APROVECHAR QUE HACEMOS EL MERGE PARA REALIZAR UNA VERSIÓN / TAG
# VAMOS A HACER QUE ESTA VERSION SOLO TENGA HASTA EL PENULTIMO COMMIT VIENDO LOS HASH DE LOS COMMITS

- Después del merge datos realizaremos :
git log interface --oneline

# BUSCAMOS EL HASH DEL PENULTIMO COMMIT
git merge abc123 ("EL HASH QUE TENGA") 

# ETIQUETAMOS EL ULTIMO COMMIT COMO V1.0
git tag v1.0 -m "Version 1.0"

# PUSHEAMOS 
git push origin main
git push origin v1.0
``` 

## EDITAMOS EL FICHERO .GITIGNORE

```bash
touch .gitignore # PARA EDITAR EL FICHERO EN EL CUAL QUEREMOS EXCLUIR CIERTAS EXTENSIONES
- O simplemente entramos al fichero y lo reescribimos de forma gráfica

Le escribiremos la siguiente línea :

* Un titulo para que sea legible = 
## Ignoramos archivos de configuración ( PARA EL EXAMEN )  
*.iml # La extensión que queremos ignorar

git add .gitignore 
git commit -m "Nombre del commit"
git push  

```
