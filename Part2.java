public class Part2 {
    public String findSimpleGene (String dna, String startCodon, String stopCodon) {
        String result = "";
        String dnaUpper = dna.toUpperCase();
        int startIndex = dnaUpper.indexOf(startCodon.toUpperCase());
        if (startIndex == -1) {
            return "Start codon not found";
        }
        int endIndex = dnaUpper.indexOf(stopCodon.toUpperCase(), startIndex + 3);
        if (endIndex == -1) {
            return "Stop codon not found";
        }
        if ((endIndex - startIndex) % 3 != 0) {
            return "Invalid gene";
        }
        result = dna.substring(startIndex, endIndex + 3);
        return "Gene is " + result;
    }
    
    public void testSimpleGene () {
        String startCodon = "atg";
        String endCodon = "taa";
        String dna = "TAAGTTGA"; // no ATG
        System.out.println("DNA Strand is " + dna);
        String gene = findSimpleGene(dna, startCodon, endCodon);
        System.out.println(gene);
        
        dna = "TTAATGGGTATAT"; // no TTA;
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna, startCodon, endCodon);
        System.out.println(gene);
        
        dna = "TTAATGGGTATAT"; // no ATG or TTA;
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna, startCodon, endCodon);
        System.out.println(gene);
        
        dna = "TTATGGTAGCCTAATGCA"; // valid gene;
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna, startCodon, endCodon);
        System.out.println(gene);
        
        dna =  "ttatggtagcctaatgca"; // valid gene lowercase;
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna, startCodon, endCodon);
        System.out.println(gene);
        
        dna = "GCATTCATGGTCATAA"; // invalid gene;
        System.out.println("DNA Strand is " + dna);
        gene = findSimpleGene(dna, startCodon, endCodon);
        System.out.println(gene);
    }
}

