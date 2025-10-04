package repository;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private double capacity; // размер на хранилищетп
    private Document [] documents; // масив от документи
    private List<Document> documentList;


    public Repository(double capacity) {
        this.capacity = capacity;
        this.documents = new Document[20];
        this.documentList = new ArrayList<>();
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    // метод за добавяне на документ в списъка
    public boolean addDocument(Document document) {
        if (this.documentList.contains(document)) {
            return false;
        }
        return this.documentList.add(document);
    }

    // метод за добавяне на документ в масива
    public void addDocument(Document document, int index) {
        this.documents[index] = document;
    }

    // метод за премахване на документ в списъка
    public boolean removeDocument(Document document) {
        return this.documentList.remove(document);
    }

    // метод за премахване на документ в масива
    public Document removeDocument(int index) {
        return this.documentList.remove(index);
    }

    // метод за текущия брой на елементите в списъка
    public int documentListSize() {
        return this.documentList.size();
    }

    // метод за обхождане на ArrayLista-a
    public void printDocumentsList() {
        for(Document document : this.documentList) {
            System.out.println(document);
        }
    }

    // метод за филтриране на документи спрямо формата на документа
    public void printDocumentsListByFormatType(FormatType formatType) {
        for (Document document : this.documentList) {
            if (document.getFormatType().equals(formatType)) {
                System.out.println(document);
            }
        }
    }

    // метод за обхождане на масива
    public void printDocumentsArray() {
        for(Document document : this.documents) {
            System.out.println(document);
        }
    }



    @Override
    public String toString() {
        return "Repository{" +
                "capacity=" + capacity +
                '}';
    }
}
