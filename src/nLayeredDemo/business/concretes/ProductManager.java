package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	//dependcy injection
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar� ya�zl�r
		if (product.getCategoryId()==1) {
			System.out.println("�r�n kabul edilmiyor.");
			return;//a�a��ya bakmaz d�n diyoruz
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi"+product.getName());
	
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
