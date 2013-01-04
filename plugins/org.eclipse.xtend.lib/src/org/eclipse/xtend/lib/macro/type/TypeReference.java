/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.lib.macro.type;

import java.util.List;

import org.eclipse.xtend.lib.macro.declaration.Type;

import com.google.common.annotations.Beta;

/**
 * @author Sven Efftinge
 */
@Beta
public interface TypeReference {

	Type getType();

	List<TypeReference> getActualTypeArguments();

	boolean isWildCard();

	TypeReference getUpperBound();

	TypeReference getLowerBound();

	boolean isArray();

	TypeReference getArrayComponentType();

	boolean isAnyType();

	boolean isPrimitive();

	TypeReference getWrapperIfPrimitive();

	boolean isWrapper();

	TypeReference getPrimitiveIfWrapper();

	boolean isPrimitiveVoid();

	/**
	 * Determines if the specified <code>TypeReference</code> parameter can be assigned to this 
	 * <code>TypeReference</code>. It returns <code>true</code> if so;
	 * otherwise it returns <code>false</code>.
	 * 
	 * @param typeReference
	 * @return returns <code>true</code> is the specified type reference parameter can be assigned to this type reference.
	 */
	boolean isAssignableFrom(TypeReference typeReference);
	
	// TODO super types, features
}
