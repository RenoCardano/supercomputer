package supercomputer;

public class Computer {
	
	private int processor;

	private int memory;
	
	private String brand;
	
	private float hddspace;

	public Computer(int processor, int memory, String brand, float hddspace) {
		super();
		this.processor = processor;
		this.memory = memory;
		this.brand = brand;
		this.hddspace = hddspace;
	}

	public int getProcessor() {
		return processor;
	}

	public void setProcessor(int processor) {
		this.processor = processor;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getHddspace() {
		return hddspace;
	}

	public void setHddspace(float hddspace) {
		this.hddspace = hddspace;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + Float.floatToIntBits(hddspace);
		result = prime * result + memory;
		result = prime * result + processor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(hddspace) != Float.floatToIntBits(other.hddspace))
			return false;
		if (memory != other.memory)
			return false;
		if (processor != other.processor)
			return false;
		return true;
	}

}
