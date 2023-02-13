package lk.ijse.dep10.ds.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import lk.ijse.dep10.ds.util.SinglyLinkedList;

import java.util.LinkedList;
import java.util.Optional;

public class MainFormController {

    public Button btnAdd;
    public Button btnClear;
    public Button btnContains;
    public Button btnPrint;
    public Button btnPrintAll;
    public Button btnRemove;
    public Button btnSize;
    public TextField txtNumber;

    private SinglyLinkedList numbers = new SinglyLinkedList();

    public void btnAddOnAction(ActionEvent event) {
        String value = txtNumber.getText();
        numbers.add(value);
        txtNumber.clear();
        txtNumber.requestFocus();
    }

    public void btnPrintAllOnAction(ActionEvent event) {
        System.out.println(numbers);
    }

    public void btnSizeOnAction(ActionEvent event) {
        System.out.println("Size: " + numbers.size());
    }

    public void btnClearOnAction(ActionEvent event) {
        numbers.clear();
    }

    public void btnPrintOnAction(ActionEvent event) {
        TextInputDialog prompt = new TextInputDialog();
        prompt.setHeaderText("Enter the index");
        Optional<String> optInput = prompt.showAndWait();
        if (optInput.isEmpty() || optInput.get().isBlank()) return;

        String input = optInput.get();
        int index = Integer.parseInt(input);
        if (index < 0 || index >= numbers.size()) {
            System.err.println("Invalid index");
            return;
        }
        System.out.println(numbers.get(index));
    }

    public void btnContainsOnAction(ActionEvent event) {
        TextInputDialog prompt = new TextInputDialog();
        prompt.setHeaderText("Enter the value");
        Optional<String> optInput = prompt.showAndWait();
        if (optInput.isEmpty() || optInput.get().isBlank()) return;

        String input = optInput.get();
        System.out.println(numbers.contains(input));
    }


    public void btnRemoveOnAction(ActionEvent event) {
        TextInputDialog prompt = new TextInputDialog();
        prompt.setHeaderText("Enter the index to remove");
        Optional<String> optInput = prompt.showAndWait();
        if (optInput.isEmpty() || optInput.get().isBlank()) return;

        String input = optInput.get();
        int index = Integer.parseInt(input);
        if (index < 0 || index >= numbers.size()) {
            System.err.println("Invalid index");
            return;
        }
        numbers.remove(index);
    }


}
