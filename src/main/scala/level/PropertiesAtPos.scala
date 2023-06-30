package me.zahara.fmc
package level

import block.{Properties, Property}

trait PropertiesAtPos[F[_], Level]:

  /**
   * Обновляет проперти на данных координатах. Если проперти есть у данного блока, то возвращает его старое значение, иначе None
   */
  def updatePropertyAt[T](level: Level, pos: BlockPos, property: Property[T], newValue: T): F[Option[T]]
end PropertiesAtPos
