import os

def rename_java_files_and_classes(root_dir):
    # Recorrer todos los archivos y subdirectorios de forma recursiva
    for dirpath, _, filenames in os.walk(root_dir):
        for filename in filenames:
            # Verificar si el archivo es un archivo .java y comienza con "T"
            if filename.endswith(".java") and filename.startswith("T"):
                old_file_path = os.path.join(dirpath, filename)
                new_filename = "V" + filename[1:]  # Cambia la "T" por "V"
                new_file_path = os.path.join(dirpath, new_filename)

                # Renombrar el archivo
                os.rename(old_file_path, new_file_path)
                print(f'Renombrado: {old_file_path} -> {new_file_path}')
                
                # Cambiar el nombre de la clase dentro del archivo
                change_class_name(new_file_path)

def change_class_name(file_path):
    # Cambiar el nombre de la clase dentro del archivo
    with open(file_path, 'r') as file:
        file_content = file.read()

    # Encontrar la clase original que comienza con "T" y cambiarla por "V"
    old_class_name = os.path.splitext(os.path.basename(file_path))[0]  # Nombre del archivo sin la extensión
    new_class_name = "V" + old_class_name[1:]

    # Reemplazar en el contenido del archivo
    new_content = file_content.replace(f"public class {old_class_name}", f"public class {new_class_name}")

    # Guardar el contenido modificado
    with open(file_path, 'w') as file:
        file.write(new_content)

    print(f'Clase renombrada dentro del archivo: {old_class_name} -> {new_class_name}')

# Llamada a la función con el directorio actual
if __name__ == "__main__":
    current_directory = os.getcwd()
    rename_java_files_and_classes(current_directory)
