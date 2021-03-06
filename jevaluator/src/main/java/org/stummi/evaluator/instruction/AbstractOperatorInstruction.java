package org.stummi.evaluator.instruction;

import java.io.PrintStream;

import lombok.RequiredArgsConstructor;

import org.objectweb.asm.MethodVisitor;
import org.stummi.evaluator.asm.ASMParseContext;

@RequiredArgsConstructor
public abstract class AbstractOperatorInstruction implements Instruction {

	private final String name;
	private final int opcode;
	
	@Override
	public void dump(PrintStream p) {
		p.println(name);
	}
	
	@Override
	public void visitMethod(ASMParseContext context, MethodVisitor visitor) {
		visitor.visitInsn(opcode);
	}
	
	@Override
	public void prepareCompilation(ASMParseContext context) {}
	
}
