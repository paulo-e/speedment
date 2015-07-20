/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.core.config.model.impl;

import com.speedment.core.config.model.Index;
import com.speedment.core.config.model.IndexColumn;
import com.speedment.core.config.model.aspects.Parent;
import com.speedment.core.config.model.parameters.OrderType;
import com.speedment.util.Cast;
import java.util.Optional;

/**
 *
 * @author pemi
 */
public class IndexColumnImpl extends AbstractOrdinalConfigEntity implements IndexColumn {

    private Index parent;
    private OrderType orderType;

    @Override
    protected void setDefaults() {
        setOrderType(OrderType.defaultFor(this));
    }

    @Override
    public OrderType getOrderType() {
        return orderType;
    }

    @Override
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    @Override
    public void setParent(Parent<?> parent) {
        this.parent = Cast.orFail(parent, Index.class);
    }

    @Override
    public Optional<Index> getParent() {
        return Optional.ofNullable(parent);
    }
}
