/*
 * package com.kiran;
 * 
 * import java.io.File; import java.io.IOException; import
 * java.lang.reflect.Field;
 * 
 * public class DemoJAr { public static void main(String[] args) throws
 * NoSuchFieldException, SecurityException, IllegalArgumentException,
 * IllegalAccessException { Runtime runtime = Runtime.getRuntime(); File
 * file=new File("C:\\Users\\kiran_veeranna\\Desktop"); try { Process exec =
 * runtime.exec("java -jar springbootshutdown-0.0.1-SNAPSHOT.jar",null, file);
 * Field field = exec.getClass().getDeclaredField("PID");
 * field.setAccessible(true); int pid= field.getInt(exec);
 * System.out.println(pid);
 * 
 * 
 * 
 * } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } }
 * 
 * }
 */