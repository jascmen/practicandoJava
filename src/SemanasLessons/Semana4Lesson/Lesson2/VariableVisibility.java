package SemanasLessons.Semana4Lesson.Lesson2;

public class VariableVisibility {
    public int count =0;
    public int suma =0;

    public void add(int data){
        this.suma += data; //suma variable de instancia
        int suma = data*2; //variable local que se llama igual que la variable de instancia, vive entre la linea 7 y 11
        count++;
    }
}
