package sample;

import javafx.application.Application;
import org.lwjgl.glfw.GLFWErrorCallback;

import static org.lwjgl.glfw.GLFW.glfwInit;

public class Launcher {

    public static void main(String[] args) throws Exception {
        System.setProperty("prism.vsync", "false");
        System.setProperty("java.awt.headless", "true");
        GLFWErrorCallback.createPrint(System.err).set();

        Application.launch(OpenGLFXGearSample.class, args);
    }
}
