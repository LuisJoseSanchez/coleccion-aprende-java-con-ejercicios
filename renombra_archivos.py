import os
import re

def rename_java_files():
    # Obtener la lista de archivos en la carpeta actual
    files = [f for f in os.listdir() if f.endswith('.java')]

    # Procesar cada archivo .java
    for filename in files:
        # Cambiar el nombre del archivo
        new_filename = filename.replace('S', 'C')
        new_filename = 'T01' + new_filename

        # Renombrar el archivo
        os.rename(filename, new_filename)

        # Leer el contenido del archivo para cambiar el nombre de la clase
        with open(new_filename, 'r') as file:
            content = file.read()

        # Buscar y cambiar el nombre de la clase
        class_name_pattern = r'(public\s+class\s+)(\w+)'
        new_class_name = new_filename.replace('.java', '')
        new_content = re.sub(class_name_pattern, r'\1' + new_class_name, content)

        # Escribir el contenido actualizado al archivo
        with open(new_filename, 'w') as file:
            file.write(new_content)

        print(f"Archivo renombrado: {filename} -> {new_filename}")
        print(f"Clase renombrada a: {new_class_name}")

if __name__ == '__main__':
    rename_java_files()
