package android.diagnosa.kerusakankomputer.connection.values;

import android.diagnosa.kerusakankomputer.model.KnowledgeBase;

public interface ValuesKnowledgeBase {
	KnowledgeBase[] knowledgeBases = {
			new KnowledgeBase("PE-001", "PE-002", "PE-011", "GE-001", ""),
			new KnowledgeBase("PE-002", "PE-003", "KO-001", "GE-002", ""),
			new KnowledgeBase("PE-003", "PE-004", "KO-002", "GE-003", ""),
			new KnowledgeBase("PE-004", "PE-005", "KO-003", "GE-004", ""),
			new KnowledgeBase("PE-005", "PE-006", "KO-004", "GE-005", ""),
			new KnowledgeBase("PE-006", "PE-007", "KO-005", "GE-006", ""),
			new KnowledgeBase("PE-007", "KO-010", "PE-008", "GE-007", ""),
			new KnowledgeBase("PE-008", "PE-009", "KO-011", "GE-008", ""),
			new KnowledgeBase("PE-009", "KO-012", "PE-010", "GE-009", ""),
			new KnowledgeBase("PE-010", "KO-013", "KO-014", "GE-010", ""),
			new KnowledgeBase("PE-011", "PE-012", "KO-006", "GE-011", ""),
			new KnowledgeBase("PE-012", "PE-013", "KO-007", "GE-012", ""),
			new KnowledgeBase("PE-013", "PE-014", "KO-010", "GE-013", ""),
			new KnowledgeBase("PE-014", "PE-015", "KO-008", "GE-014", ""),
			new KnowledgeBase("PE-015", "PE-009", "KO-009", "GE-015", ""),
			new KnowledgeBase("KO-001", "", "", "","KE-001"),
			new KnowledgeBase("KO-002", "", "", "","KE-002"),
			new KnowledgeBase("KO-003", "", "", "","KE-003"),
			new KnowledgeBase("KO-004", "", "", "","KE-004"),
			new KnowledgeBase("KO-005", "", "", "","KE-005"),
			new KnowledgeBase("KO-006", "", "", "","KE-006"),
			new KnowledgeBase("KO-007", "", "", "","KE-007"),
			new KnowledgeBase("KO-008", "", "", "","KE-008"),
			new KnowledgeBase("KO-009", "", "", "","KE-009"),
			new KnowledgeBase("KO-010", "", "", "","KE-010"),
			new KnowledgeBase("KO-011", "", "", "","KE-011"),
			new KnowledgeBase("KO-012", "", "", "","KE-012"),
			new KnowledgeBase("KO-013", "", "", "","KE-013"),
			new KnowledgeBase("KO-014", "", "", "","KE-014"),
	};
}
