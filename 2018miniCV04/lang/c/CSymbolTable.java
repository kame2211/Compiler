package lang.c;

//import lang.IOContext;
import lang.SymbolTable;

public class CSymbolTable {
	public CSymbolTable() {
		setOneSymbolTableGlobal(new OneSymbolTable());
		setOneSymbolTableLocal(new OneSymbolTable());
	}

	
	private class OneSymbolTable extends SymbolTable<CSymbolTableEntry> {
		@Override
		public CSymbolTableEntry register(String name, CSymbolTableEntry e) {
			return put(name,e);
		}
		@Override
		public CSymbolTableEntry search(String name) { 
			return get(name);
		}
	}
	private OneSymbolTable global; // 大域変数用
	public SymbolTable<CSymbolTableEntry> getCSymbolTableGlobal() { return (SymbolTable<CSymbolTableEntry>)global; }
	public void setOneSymbolTableGlobal(OneSymbolTable ost) { this.global = ost; }
	
	private OneSymbolTable local; // 局所変数用
	public SymbolTable<CSymbolTableEntry> getCSymbolTableLocal() { return (SymbolTable<CSymbolTableEntry>)local; }
	public void setOneSymbolTableLocal(OneSymbolTable ost) { this.local = ost; }
	// private SymbolTable<CSymbolTableEntry> global; // こう書いても、もちろんOK
	// private SymbolTable<CSymbolTableEntry> local; // （同上）
}