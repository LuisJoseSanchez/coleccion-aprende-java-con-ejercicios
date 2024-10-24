import os

def fix_class_names_in_java_files(root_dir):
    # Recorrer todos los archivos y subdirectorios de forma recursiva
    for dirpath, _, filenames in os.walk(root_dir):
        for filename in filenames:
            # Verificar si es un archivo .java
            if filename.endswith(".java"):
                file_path = os.path.join(dirpath, filename)
                # Cambiar el nombre de la clase dentro del archivo
                change_class_name(file_path)

def change_class_name(file_path):
    with open(file_path, 'r') as file:
        file_content = file.read()

    # Encontrar la clase original que comienza con "T" y cambiarla por "V"
    old_class_name = None
    new_class_name = None
    for line in file_content.splitlines():
        if "public class T" in line:
            old_class_name = line.split("class ")[1].split()[0]
            new_class_name = "V" + old_class_name[1:]
            break

    if old_class_name and new_class_name:
        # Reemplazar en el contenido del archivo
        new_content = file_content.replace(f"public class {old_class_name}", f"public class {new_class_name}")
        with open(file_path, 'w') as file:
            file.write(new_content)
        print(f'Clase renombrada en {file_path}: {old_class_name} -> {new_class_name}')

# Llamada a la función con el directorio actual
if __name__ == "__main__":
    current_directory = os.getcwd()  # Usa el directorio actual o especifica uno diferente
    fix_class_names_in_java_files(current_directory)
