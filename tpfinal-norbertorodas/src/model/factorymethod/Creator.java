package model.factorymethod;

/**
 * Interface creator, part of factory method pattern
 * 
 * @author beto
 *
 */
public interface Creator {

	Rule create(String type);
}
