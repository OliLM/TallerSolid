
package ec.edu.espol.ejemplossolid;


// Mal
class Impresora {
    public void imprimir(Documento documento) {
        if (documento.getFormato().equals("pdf")) {
            // Imprimir el documento PDF
        } else if (documento.getFormato().equals("doc")) {
            // Imprimir el documento DOC
        }
    }
}

public interface Documento{
    void imprimir();

    public Object getFormato();
}

// Bien
class ImpresoraCorrecta {
    public void imprimir(Documento documento) {
        documento.imprimir();
    }
}

class DocumentoPDF implements Documento {
    @Override
    public void imprimir() {
        // Imprimir el documento PDF
    }

    @Override
    public Object getFormato() {
        return null;
    }
}

class DocumentoDOC implements Documento {
    @Override
    public void imprimir() {
        // Imprimir el documento DOC
    }

    @Override
    public Object getFormato() {
        return null;
    }
}

