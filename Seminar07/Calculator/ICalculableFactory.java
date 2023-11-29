package Seminar07.Calculator;

public interface ICalculableFactory {
    Calculable create(int primaryArg, boolean logFlag);
}
