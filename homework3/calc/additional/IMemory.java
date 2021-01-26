package homework3.calc.additional;


import homework3.calc.api.ICalculator;

public interface IMemory extends ICalculator {
    void saveMemoryResult();

    double getMemoryResult();

    ICalculator getCalculator();
}
